package Program;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoublyLLTest {
    @Test
    void DoublyLL() {

    DoublyLL d = new DoublyLL();
    DcChar Char1 = new DcChar();
    DcChar Char2 = new DcChar();
    DcChar Char3 = new DcChar();
    d.prepend(Char1);
    d.append(Char3);
    d.insertAfter(d.head, Char2);
    d.printlist(d.head);

}








}