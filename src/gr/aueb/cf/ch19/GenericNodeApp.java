package gr.aueb.cf.ch19;

public class GenericNodeApp {

    public static void main(String[] args) {
        GenericNode genericNode = new GenericNode();
        genericNode.setValue("Coding");
        int val = (int) genericNode.getValue();// non-existence of compile-type safety, we have runtime error
    }
}
