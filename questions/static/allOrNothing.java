public class All {
    public static Item[] orNothing(int count, boolean bool) {
        Item[] newArray = new Item[count];
        if (bool) {
            Item sameItem = newItem();
            for (int i  = 0; i < count; i++) {
                newArray[i] = sameItem;
            }
        } else {
            for (int i = 0; i < count; i++) {
                newArray[i] = new Item();
            }
        }
        return newArray;
    }
}