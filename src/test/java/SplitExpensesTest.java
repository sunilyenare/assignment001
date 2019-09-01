import com.thoughtworks.split.expenses.SplitExpenses;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class SplitExpensesTest {
    @Test
    void givenZeroMember_WhenAdded_ThenShouldReturnZeroExpenses(){
        List<String> groupList=new ArrayList<String>();
        SplitExpenses manager=new SplitExpenses(" ",0.0f,groupList);
        Assertions.assertEquals(0.0f,manager.spendDetail());
    }


    @Test
    void givenOneMember_WhenAddedZeroAmount_ThenShouldReturnZeroExpenses(){
        List<String> groupList=new ArrayList<String>();
        groupList.add("A");
        SplitExpenses manager=new SplitExpenses("A",10.0f,groupList);
        Assertions.assertEquals(10.0,manager.spendDetail());
        groupList.clear();
    }

    @Test
    void givenTwoMember_WhenAdded_ThenShouldReturnSplitExpenses(){
        List<String> groupList=new ArrayList<String>();
        groupList.add("A");
        groupList.add("B");
        SplitExpenses manager=new SplitExpenses("A",100.0f,groupList);
        Assertions.assertEquals(50.0,manager.spendDetail());
        groupList.clear();
    }

    @Test
    void givenMemberIsPayer_WhenAdded_ThenShouldReturnTrue(){
        List<String> groupList=new ArrayList<String>();
        groupList.add("A");
        groupList.add("B");
        groupList.add("C");
        groupList.add("D");
        SplitExpenses manager=new SplitExpenses("B",100.0f,groupList);
        Assertions.assertEquals(true,manager.checkIfPayerIsMember());
        groupList.clear();

    }
}
