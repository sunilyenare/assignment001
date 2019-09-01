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



}
