package com.directi.training.isp.exercise;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class TimedDoor implements ITimeDoor
{
    private static final int TIME_OUT = 100;
    private boolean _locked;
    private boolean _opened;

    public TimedDoor(Timer timer)
    {
        timer.register(TIME_OUT, this);
    }

    public void lock()
    {
        _locked = true;
    }


    public void unlock()
    {
        _locked = false;
    }


    public void open()
    {
        if (!_locked) {
            _opened = true;
        }
    }


    public void close()
    {
        _opened = false;
    }


    public void timeOutCallback()
    {
        _locked = true;
    }


    public void proximityCallback()
    {
        throw new NotImplementedException();
    }
}
