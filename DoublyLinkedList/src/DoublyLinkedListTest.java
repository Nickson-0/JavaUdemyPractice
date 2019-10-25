import static org.junit.jupiter.api.Assertions.*;

class DoublyLinkedListTest {

    @org.junit.jupiter.api.Test
    public void isEmpty() {
        DoublyLinkedList<Integer> testDLL = new DoublyLinkedList<>();
        assertTrue(testDLL.isEmpty(), "Testing is empty on empty list");

        testDLL.push(1);
        assertFalse(testDLL.isEmpty(), "Testing is empty on empty list");
    }

    @org.junit.jupiter.api.Test
    public void insertBefore() {
        DoublyLinkedList<Integer> testDLL = new DoublyLinkedList<>();
        testDLL.insertBefore(0, 1);
        testDLL.insertBefore(0, 9);
        testDLL.insertBefore(1, 2);
        testDLL.insertBefore(3, 3);

        testDLL.insertBefore(2, 4);
        assertEquals(testDLL.toString(), "9,2,4,1,3");
        testDLL.deleteAt(2);
        testDLL.deleteAt(0);

        testDLL.insertBefore(0, 4);
        assertEquals(testDLL.toString(), "4,2,1,3");
        testDLL.insertBefore(1, 5);
        assertEquals(testDLL.toString(), "4,5,2,1,3");
        testDLL.insertBefore(2, 6);
        assertEquals(testDLL.toString(), "4,5,6,2,1,3");
        testDLL.insertBefore(-1, 7);
        assertEquals(testDLL.toString(), "7,4,5,6,2,1,3");
        testDLL.insertBefore(7, 8);
        assertEquals(testDLL.toString(), "7,4,5,6,2,1,3,8");
        testDLL.insertBefore(700, 9);
        assertEquals(testDLL.toString(), "7,4,5,6,2,1,3,8,9");


        // test empty list
        testDLL = new DoublyLinkedList<Integer>();
        testDLL.insertBefore(0, 1);
        assertEquals(testDLL.toString(), "1");
        testDLL = new DoublyLinkedList<Integer>();
        testDLL.insertBefore(10, 1);
        assertEquals( testDLL.toString(), "1");
        testDLL = new DoublyLinkedList<Integer>();
        testDLL.insertBefore(-10, 1);
        assertEquals(testDLL.toString(), "1");
    }

    @org.junit.jupiter.api.Test
    public void get() {
        DoublyLinkedList<Integer> testDLL = new DoublyLinkedList<>();

        assertNull(testDLL.getNode(0),"Getting element of empty list");

        testDLL.push(1);
        testDLL.push(2);
        testDLL.push(3);
        testDLL.push(4);
        testDLL.push(5);
        testDLL.push(6);
        testDLL.push(7);
        testDLL.push(8);

        assertNull( testDLL.get(-2),"Got element -2 returned null");

        int test = testDLL.get(7);
        assertEquals(test,  1);

        test = testDLL.get(4);
        assertEquals(test, 4, "Got middle element");

        assertNull(testDLL.get(23),"Got element past length");
    }

    @org.junit.jupiter.api.Test
    public void deleteAt() {
        // test non-empty list
        DoublyLinkedList<Integer> testDLL = new DoublyLinkedList<>();
        testDLL.insertBefore(0, 1);
        testDLL.insertBefore(1, 2);
        testDLL.insertBefore(2, 3);
        testDLL.insertBefore(0, 4);

        testDLL.deleteAt(2);
        assertEquals(testDLL.toString(), "4,1,3","Checking deleteAt to a list containing 4 elements");

        testDLL.insertBefore(1, 5);
        testDLL.deleteAt(3);
        assertEquals(testDLL.toString(), "4,5,1", "Checking deleteAt to a list containing 4 elements at position 3");

        testDLL.deleteAt(0);
        assertEquals(testDLL.toString(), "5,1", "Checking deleteAt to a list containing 3 elements at position 0");

        testDLL.deleteAt(-12);
        assertEquals(testDLL.toString(),"5,1","Checking deleteAt on a minus value on a list with 2 elements");

        testDLL.deleteAt(0);
        testDLL.deleteAt(0);
        assertEquals(testDLL.toString(),"","Checking deleteAt list with 1 element" );


        testDLL.push(1);
        testDLL.push(2);
        testDLL.push(3);
        testDLL.push(4);

        testDLL.deleteAt(100);
        assertEquals(testDLL.toString(), "4,3,2,1", "Checking deleteAt on a value bigger then the list" );

        // test empty list
        testDLL = new DoublyLinkedList<Integer>();
        testDLL.deleteAt(0);
        assertEquals( testDLL.toString(),"","Checking deleteAt to an empty list at position 0 - expected nothing in list");
        testDLL = new DoublyLinkedList<Integer>();
        testDLL.deleteAt(10);
        assertEquals(testDLL.toString(),"","Checking deleteAt to an empty list at position 10 - expected nothing in list");
        testDLL = new DoublyLinkedList<Integer>();
        testDLL.deleteAt(-10);
        assertEquals(testDLL.toString(),"","Checking deleteAt to an empty list at position -10 - expected nothing in list");

    }

    @org.junit.jupiter.api.Test
    public void reverse() {
        DoublyLinkedList<Integer> testDLL = new DoublyLinkedList<>();
        testDLL.insertBefore(0, 1);

        testDLL.reverse();
        assertEquals(testDLL.toString(), "1","Checking reverse on a list containing 1 element" );

        testDLL.insertBefore(1, 2);
        testDLL.insertBefore(2, 3);
        testDLL.insertBefore(3, 4);

        testDLL.reverse();
        assertEquals(testDLL.toString(), "4,3,2,1", "Checking reverse on a list containing 4 elements" );

        testDLL = new DoublyLinkedList<>();
        assertEquals(testDLL.toString(), "", "Checking reverse on empty list" );

    }

    @org.junit.jupiter.api.Test
    public void makeUnique() {
        DoublyLinkedList<Integer> testDLL = new DoublyLinkedList<>();
        testDLL.insertBefore(0, 1);
        testDLL.insertBefore(1, 2);
        testDLL.insertBefore(2, 3);
        testDLL.insertBefore(3, 4);

        testDLL.makeUnique();
        assertEquals(testDLL.toString(),"1,2,3,4","Checking unique to a list containing 4 elements");

        testDLL.insertBefore(3, 3);
        testDLL.makeUnique();
        assertEquals(testDLL.toString(), "1,2,3,4","Checking unique to a list containing 4 elements" );

        testDLL = new DoublyLinkedList<>();
        testDLL.makeUnique();
        assertEquals(testDLL.toString(),"", "Checking unique to a list containing 0 elements" );
    }

    @org.junit.jupiter.api.Test
     public void testQueue() {
        DoublyLinkedList<Integer> queue = new DoublyLinkedList<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        assertEquals(queue.toString(),"1,2,3,4,5","Checking enqueue 5 elements worked");

        int dequeued = queue.dequeue();
        assertEquals(dequeued,1 , "Checking pop returned top element");

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        assertEquals(queue.toString(), "5", "Checking pop 3 elements worked");

        queue.dequeue();
        queue.dequeue();
        assertEquals(queue.toString(),"", "Checking pop on empty list");
    }

    @org.junit.jupiter.api.Test
    public void testStack() {
        DoublyLinkedList<Integer> stack = new DoublyLinkedList<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        assertEquals(stack.toString(), "5,4,3,2,1", "Checking push 5 elements worked");

        int popped = stack.pop();
        assertEquals(popped, 5 , "Checking pop returned top element");

        stack.pop();
        stack.pop();
        stack.pop();
        assertEquals(stack.toString(),"1","Checking pop 3 elements worked" );

        stack.pop();
        stack.pop();
        assertEquals(stack.toString(), "","Checking pop on empty list");
    }
}