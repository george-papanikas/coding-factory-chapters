package gr.aueb.cf.ch16.multipleinh;

public class Singer extends TalkingBook implements ITalking {
//    @Override
//    public void read() {
//
//    }
//
//    @Override
//    public void speak() {
//
//    }
// no need to implement these methods as they are inherited as Singer extends TalkingBook
    @Override
    public void sing() {
        System.out.println("sing");

    } // implements all 3 interfaces
}
