public class Copier {
    public static Item[] copy(Item[] input) {
        if (input == null) {
            return null;
        }
    
    Item[] newArray = new Item[input.length];
    for (int i = 0; i < input.length; i++) {
        /* 
        newArray[i] = input[i]
        this won't work because we need New Item() to create a deep copy
        So if input is changed, then newArray[i] would too which is bad
        We don't want to create a reference, we need new objects entirely
        */
       newArray[i] = new Item(input[i]);
        }   
    return newArray;
    }
}