package com.it1311l.uap.simplespringbootapp;

import java.util.ArrayList;
import java.util.Arrays;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SortInteger 
{
	@GetMapping("/sort")
	public ArrayList<Integer> sortInteger()
	{
		ArrayList<Integer> unsortedIntegers = new ArrayList<>(Arrays.asList(3,10,8,9,2,2,8,10,2,3));
		
		int n = unsortedIntegers.size();
        int temp = 0;

        for (int i = 0; i < n; i++) 
        {
            for (int j = 1; j < (n - i); j++) 
            {
                if (unsortedIntegers.get(j - 1) < unsortedIntegers.get(j)) 
                { 
                    temp = unsortedIntegers.get(j - 1);
                    unsortedIntegers.set(j - 1, unsortedIntegers.get(j));
                    unsortedIntegers.set(j, temp);
                }
            }
        }
         
		return unsortedIntegers;
	}
}
