/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooad_assn7_fsa;

/**
 *
 * @author aishwariyatalathi
 */
public class Concrete5 implements State {

    @Override
    public void handler_a(Context c) {
        System.out.println("State5");
        c.SetState(this);
    }

    @Override
    public void handler_b(Context c) {
        System.out.println("State6");
        c.SetState(new Concrete6());
    }

    @Override
    public void handler_c(Context c) {
        System.out.println("State4");
        c.SetState(new Concrete4());
    }

}
