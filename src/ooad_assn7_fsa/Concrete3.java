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
public class Concrete3 implements State {

    @Override
    public void handler_a(Context c) {
        System.out.println("State2");
        c.SetState(new Concrete2());
    }

    @Override
    public void handler_b(Context c) {
        System.out.println("State1");
        c.SetState(new Concrete1());
    }

    @Override
    public void handler_c(Context c) {
        System.out.println("State4");
        c.SetState(new Concrete4());
    }

}
