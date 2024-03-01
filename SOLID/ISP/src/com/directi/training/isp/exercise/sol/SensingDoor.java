package com.directi.training.isp.exercise;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class SensingDoor implements ISensingDoorDoor
{
    private boolean _locked;
    private boolean _opened;

    public SensingDoor(Sensor sensor)
    {
        sensor.register(this);
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
        throw new NotImplementedException();
    }

    public void proximityCallback()
    {
        _opened = true;
    }
}
