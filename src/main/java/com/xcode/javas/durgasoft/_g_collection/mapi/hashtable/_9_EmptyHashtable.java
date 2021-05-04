package com.xcode.javas.durgasoft._g_collection.mapi.hashtable;

/**
 * Created by jarvis on 7/7/17.
 */
/*
  Remove all values from Java Hashtable example
  This Java Example shows how to remove all values from Hashtable object or empty
  Hashtable or clear Hashtable using clear method.
*/

import java.util.Hashtable;

public class _9_EmptyHashtable {

    public static void main(String[] args) {

        //create Hashtable object
        Hashtable ht = new Hashtable();

        //add key value pairs to Hashtable
        ht.put("1","One");
        ht.put("2","Two");
        ht.put("3","Three");

    /*
      To remove all values or clear Hashtable use
      void clear method() of Hashtable class. Remove method removes all
      key value pairs contained in Hashtable.
    */
        System.out.println(ht);
        ht.clear();

        System.out.println("Total key value pairs in Hashtable are : " + ht.size());
    }
}

/*
Output would be
Total key value pairs in Hashtable are : 0
*/