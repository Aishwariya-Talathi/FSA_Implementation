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
public class Context {

    private State state;

    public Context() {
        state = new Concrete1();
        System.out.println("State1");
    }

    public void SetState(State s) {
        state = s;
    }

    public String getState() {
        String s = state.getClass().getSimpleName();
        return s;
    }

    public void Handle_a() {
        state.handler_a(this);
    }

    public void Handle_b() {
        state.handler_b(this);
    }

    public void Handle_c() {
        state.handler_c(this);
    }
}
