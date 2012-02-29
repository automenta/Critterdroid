package jcog.critterding;

import com.syncleus.dann.neural.OutputNeuron;

public class MotorNeuron implements CritterdingNeuron, OutputNeuron {
    private boolean firing;

    public void setFiring(boolean f) {
        if (firing!=f) {
            firing = f;

            if (f == false)
                onCleared();
            else
                onFired();
            
        }
    }
    @Override
    public double getOutput() {
        return firing ? 1.0 : 0.0;
    }

    @Override
    public void tick() {
    }

    public void onFired() { }
    public void onCleared() { }

}

