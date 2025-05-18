import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SILab2Test {
    @Test
    public void test_Multiple_Conditions() {
        Item badName = new Item("",20,21,22);
        List<Item> allItems = List.of(badName);

        String cardNumber = "123456789012345";
        RuntimeException exception = assertThrows(RuntimeException.class, () -> {
            SILab2.checkCart(allItems, cardNumber);
        });
        assertEquals("Invalid item!", exception.getMessage());

    }
    @Test
    public void test_Every_Statement() {
        Item badNumber = new Item("Item",20,500,20);
        String cardNumber = null;

        List<Item> allItems = List.of(badNumber);
        RuntimeException exception = assertThrows(RuntimeException.class, () -> {
            SILab2.checkCart(allItems, cardNumber);
        });
        assertEquals("Invalid card number!", exception.getMessage());

    }
}
