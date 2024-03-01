package com.directi.training.ocp.exercise.sol;


public class ResourceAllocator {
    
        public int allocate(Resource resource){
            int resourceId = resource.findFreeSlot();
            resource.markSlotBusy();
            return resourceId;
        }
        public void free(Resource resource){
            resource.markSlotFree();
        }
    
}
