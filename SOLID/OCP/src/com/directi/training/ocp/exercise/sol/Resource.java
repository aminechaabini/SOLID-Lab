package com.directi.training.ocp.exercise.sol;

public abstract class Resource {

    public abstract void markSlotFree();

    public abstract void markSlotBusy();

    public abstract int findFreeSlot();
}
