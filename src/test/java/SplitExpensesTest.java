import com.thoughtworks.split.expenses.SplitExpenses;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class SplitExpensesTest {
    @Test
    void givenZeroMember_WhenAdded_ThenShouldReturnZeroExpenses(){
        List<String> groupList=new ArrayList<String>();
        SplitExpenses manager=new SplitExpenses(" ",0,groupList);
        Assertions.assertEquals(0,manager.spendDetail());
    }


    @Test
    void givenOneMember_WhenAdded_ThenShouldReturnExpensess(){
        List<String> groupList=new ArrayList<String>();
        groupList.add("A");
        SplitExpenses manager=new SplitExpenses("A",0,groupList);
        Assertions.assertEquals(0,manager.spendDetail());
    }

//    @Test
//    void givenZeroAmount_WhenCalculateExpenses_ThenShouldReturnZero(){
//
//        SplitExpenses splitExpenses=new SplitExpenses();
//        Assertions.assertEquals(0.00,splitExpenses.);
//
//    }
}
