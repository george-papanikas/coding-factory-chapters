package gr.aueb.cf.ch19;

public class NodeGenericApp {

    public static void main(String[] args) {
        //var nodeInt = new NodeGeneric<Integer>();
        NodeGeneric<Integer> nodeInt = new NodeGeneric<>();
        NodeGeneric<String> nodeStr = new NodeGeneric<>();

        // nodeInt.setValue("Coding"); can not do it anymore - compile-type safety
        nodeInt.setValue(3);
        // nodeStr.setValue(2); can not do it anymore - compile-type safety
        nodeStr.setValue("Coding");
        // int val = (int) nodeStr.getValue(); - compile-type safety
    }

}
