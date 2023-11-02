package ocp;

public abstract class ResourceAllocator {
	private static final int INVALID_RESOURCE_ID = -1;
	
	public int allocate() {
		int resourceId;
		resourceId = findFreeSlot();
        markSlotBusy(resourceId);
        return resourceId;
		}
	
	public void free(int resourceId) {
		markSlotFree(resourceId);
	}
	
	
	
	protected abstract void markSlotFree(int resourceId);
	protected abstract int findFreeSlot();
    protected abstract void markSlotBusy(int resourceId);

}
