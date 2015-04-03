
package lab4;

public class IntegerArrayList {


    private int size;
    private int length;
    private int[] list;
    
    public IntegerArrayList()
    {
        size = 1;
        list = new int[size];
        length = 0;
    }
    
    public IntegerArrayList(int size)
    {
        this.size = size;
        list = new int[this.size];
        length = 0;
        
    }
    
    public int getLength()
    {
        return length;
    }
    
    public int getSize()
    {
        return size;
    }
    
    public void add(int index, int value)
    {
        //Adds an integer value to the end of the list/array
        System.out.println("Adding the value " + value + " to element position " + index +"...");
        int end_element_index = size - 1 ;
        
        if (index >= end_element_index) {
            System.out.println("Array out of space! Expanding array ...");
            int expanded_size = index + 1;
            int[] new_array = new int[expanded_size];
            System.out.println("Expanded array to new size : " + expanded_size + " element capacity");
            System.arraycopy(list, 0, new_array, 0, size);
            list = new_array;
            size = expanded_size;
            
        }
        list[index] = value;
        length++;
        
    }
    
    
    public void add(int value)
    {
        //Insert an integer value at the specified index
        
        System.out.println("add value \n\n");
        if ( (length == 0) && (size==1) )
        {
            
            System.out.println("" + value + " " + 0 +"...");
            list[0] = value;
            length++;
            
        }
        else if ( ( length > 0 ) && (size >= 1) )
        {
            
            System.out.println("Array out of space ");
            int expanded_size = size + 1;
            int[] new_array = new int[expanded_size];
            System.out.println("Expanded array to new size : " + expanded_size + " element capacity ");
            System.arraycopy(list, 0, new_array, 0, size);
            list = new_array;
            size = expanded_size;
            System.out.println("Array expanded and new elements added!\n\n");
            
            
            int end_element_index = size - 1 ;
            int index = end_element_index;
            System.out.println("Adding the value " + value + " to element position " + index +"...");
            list[index] = value;
            length++;
            
        }
        
    }
    public int remove(int index)
    {
        try{
            //Remove and return the value from the specified index in the list/array.
            if (size != 0) {
                
                int removed_value;
                int end_element_index;
                
                removed_value = list[index];
                System.out.println("removed value = " + removed_value  );
                
                end_element_index = size - 1 ;
                
                if (index ==  end_element_index) {
                    
                    list[end_element_index] = -1;
                    length--;
                    
                    if(length < 0){
                        length = 0;
                    }
                    
                    System.out.println("Array reduced ");
                    int contracted_size = (end_element_index + 1) - 1;
                    
                    int[] new_array = new int[contracted_size];
                    System.out.println("New size : " + contracted_size + " \n\n");
                    System.arraycopy(list, 0, new_array, 0, contracted_size);
                    list = new_array;
                    size = contracted_size;
                    System.out.println("removed!\n\n");
                    
                    
                }
                else if (index < end_element_index)
                {
                    
                    for (int idx = index + 1; idx <= end_element_index; idx++)
                    {
                        list[idx-1] = list[idx];
                    }
                    
                    list[end_element_index] = -1;
                    length--;
                    System.out.println("Array reduced in space! Contracting array ...\n\n");
                    int contracted_size = (end_element_index + 1) - 1;
                    int[] new_array = new int[contracted_size];
                    System.out.println("Contracted array to new size : " + contracted_size + " element capacity \n\n");
                    System.arraycopy(list, 0, new_array, 0, contracted_size);
                    list = new_array;
                    size = contracted_size;
                    System.out.println("removed!\n\n");

                    
                }
                else if (index > end_element_index){
                    System.out.println("Element at index position " + index +  " does not exist!");
                }
                
                
                return removed_value; 
            }
            else
            {
                return -1;
            }
            
            
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            
            e.printStackTrace();
            System.out.println("Out of bounds " + e.getMessage() + "\n\n" );
            
            
            return -1;
            
        }
        
    }
    
    public int get(int index)
    {
        //Return the integer value at the specified index
        
        try
        {
            
            int value; 
            value = list[index];
            
            return value; 
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            e.printStackTrace();
            System.out.println("out of index " + e.getMessage() + "\n\n" );
            
            return -1;
            
        }
        
    }
    
    public int indexOf(int value)
    {
        //Return the index of the specified value in the list/array.  Return -1 if not present.
        for(int i=0; i<length; i++)
        {
            
            if(list[i] == value)
            {
                
                System.out.println(" " + i);
                return i ;
            }
            
        }
        System.out.println(" " + -1);
        return -1 ;
    }
    
    public boolean isEmpty()
    {
        //Return true if the list/array is empty, else false
        if (length<=0)
        {
            System.out.println("true");
            return true;
        }
        else
        {
            System.out.println("false");
            return false;
        }
        
    }
    
    
    public void printList()
    {
        int list_length = size;
        if (list_length==0) { 
            System.out.println("List is Empty");
        }
        else if (list_length > 0 )
        {
            
            for(int i=0; i<list_length; i++)
            {
                System.out.println("list[" + i + "]: " + list[i]);
            }
            
        }   
    }
    
    
}
