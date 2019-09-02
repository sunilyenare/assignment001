import com.thoughtworks.split.expenses.SplitExpenses;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class SplitExpensesTest {
    @Test
    void givenZeroMember_WhenAdded_ThenShouldReturnZeroExpenses(){
        List<String> groupList=new ArrayList<String>();
        SplitExpenses manager=new SplitExpenses(" ", false,0.0f,groupList);
        Assertions.assertEquals(0.0f,manager.checkSpendDetail());
    }


    @Test
    void givenOneMember_WhenAddedAmount_ThenShouldReturnExpenses(){
        List<String> groupList=new ArrayList<String>();
        groupList.add("A");
        SplitExpenses manager=new SplitExpenses("A",true,10.0f,groupList);
        Assertions.assertEquals(10.0,manager.checkSpendDetail());
        groupList.clear();
    }

    @Test
    void givenTwoMember_WhenAdded_ThenShouldReturnSplitExpenses(){
        List<String> groupList=new ArrayList<String>();
        groupList.add("A");
        groupList.add("B");
        SplitExpenses manager=new SplitExpenses("A",true,100.0f,groupList);
        Assertions.assertEquals(50.0,manager.checkSpendDetail());
        groupList.clear();
    }

    @Test
    void givenCheckMemberIsPayer_WhenAdded_ThenShouldReturnTrue(){
        List<String> groupList=new ArrayList<String>();
        groupList.add("A");
        groupList.add("B");
        groupList.add("C");
        groupList.add("D");
        SplitExpenses manager=new SplitExpenses("B",true,100.0f,groupList);
        Assertions.assertEquals(true,manager.checkIfPayerIsMember());
        groupList.clear();

    }
    @Test
    void givenMemberIsPayer_WhenAdded_ThenShouldReturnEqualSplitExpenses(){
        List<String> groupList=new ArrayList<String>();
        groupList.add("A");
        groupList.add("B");
        groupList.add("C");
        groupList.add("D");
        groupList.add("E");
        groupList.add("F");
        SplitExpenses manager=new SplitExpenses("A",true,360.0f,groupList);
        Assertions.assertEquals(60,manager.checkSpendDetail());
        groupList.clear();

    }

    @Test
    void givenMembersIsPayerButNotAPartOfExpense_WhenAdded_ThenShouldReturnNotEqualSplitExpenses(){
        List<String> groupList=new ArrayList<String>();
        groupList.add("A");
        groupList.add("B");
        groupList.add("C");
        groupList.add("D");
        groupList.add("E");
        SplitExpenses manager=new SplitExpenses("A",false,100.0f,groupList);
        Assertions.assertEquals(25,manager.checkSpendDetail());
        groupList.clear();

    }

}
