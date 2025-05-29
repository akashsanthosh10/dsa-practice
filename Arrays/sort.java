import java.util.Arrays;

public class sort {
    static void display(int[] arr)
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
    }

    ////////////////////////Insertion Sort////////////////////////////////////
    static int[] insertion_sort(int[] arr)
    {
        int n=arr.length;
        int j=1;

        for(int i=1;i<n;i++)
        {
            j=i-1;
            int key=arr[i];
            while(j>=0 && arr[j]>key)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
            //display(arr);
        }
        return arr;
    }
    ////////////////////////Bubble Sort////////////////////////////////////
    static int[] bubble_sort(int[] arr)
    {
        int n= arr.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            //display(arr);
        }
        return arr;
    }
    ////////////////////////Selection Sort////////////////////////////////////
    static int[] selection_sort(int[] arr)
    {
        int n= arr.length;
        for(int i=0;i<n-1;i++)
        {
           int min=i;
           for(int j=i+1;j<n;j++)
           {
                if(arr[min]>arr[j])
                {
                    min=j;
                }
           }
           int temp=arr[min];
           arr[min]=arr[i];arr[i]=temp;
           //display(arr);
        }
        return arr;
    }
    ////////////////////////Merge Sort////////////////////////////////////
    static void merge(int[] arr,int l,int m,int r)
    {
        int n1=m-l+1;
        int n2=r-m;

        int[] L=new int[n1];
        int[] R=new int[n2];

        for(int i=0;i<n1;i++)
            L[i]=arr[l+i];
        for(int j=0;j<n2;j++)
            R[j]=arr[m+1+j];
        // System.out.print("Left array L: ");
        // for (int i = 0; i < n1; i++) System.out.print(L[i] + " ");
        // System.out.println();

        // System.out.print("Right array R: ");
        // for (int j = 0; j < n2; j++) System.out.print(R[j] + " ");
        // System.out.println();

        int i=0,j=0;
        int k=l;
        while(i<n1 && j<n2)
        {
            if(L[i]<R[j])
            {
                arr[k]=L[i];
                i++;
            }
            else
            {
                arr[k]=R[j];
                j++;
            }
            k++;
        }
        while(i<n1)
        {
            arr[k]=L[i];
            i++;
            k++;
        }
        while(j<n2)
        {
            arr[k]=R[j];
            j++;
            k++;
        }
    //     System.out.print("Merged array from index " + l + " to " + r + ": ");
    // for (int x = l; x <= r; x++) {
    //     System.out.print(arr[x] + " ");
    // }
    // System.out.println("\n----------------------------");

    }
    static void merge_sort(int[] arr,int l,int r)
    {
        if(l<r)
        {
            int mid=l+(r-l)/2;
            merge_sort(arr,l,mid);
            merge_sort(arr,mid+1,r);
            merge(arr,l,mid,r);
        }
    }


    ////////////////////////Quick Sort////////////////////////////////////
    static int partition(int[] arr,int low,int high)
    {
        int pivot=arr[high];

        int i=low-1;

        for(int j=low;j<=high-1;j++)
        {
            if(arr[j]<pivot)
            {
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        int temp=arr[high];
        arr[high]=arr[i+1];
        arr[i+1]=temp;

        return i+1;
    }
    static void quick_sort(int[] arr,int low,int high)
    {
        if(low<high)
        {
            int p=partition(arr,low,high);
            quick_sort(arr, low, p-1);
            quick_sort(arr, p+1, high);
        }
    }



    ////////////////////////Heap Sort////////////////////////////////////
    static void heapify(int[] arr,int n,int i)
    {
        // Initialize largest as root
       int largest=i;
        // left index and right index
       int l=2*i+1;
       int r=2*i+2;

       // If left child is larger than root
        if (l < n && arr[l] > arr[largest]) {
            largest = l;
        }

        // If right child is larger than largest so far
        if (r < n && arr[r] > arr[largest]) {
            largest = r;
        }
        // If largest is not root
        if (largest != i) 
        {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }
    static void heap_sort(int[] arr)
    {
        int n=arr.length;
        // Build heap (rearrange array)
        for(int i=n/2-1;i>=0;i--)
            heapify(arr,n,i);
        for (int i = n - 1; i > 0; i--) 
        {

            // Move current root to end
            int temp = arr[0]; 
            arr[0] = arr[i];
            arr[i] = temp;

            // Call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }
    public static void main(String[] args) {
        int[] arr={2,6,3,9,1,8,6,2};
        int n=arr.length;
        System.out.println("Original Array:");
        display(arr);

        System.out.println("\nInsertion Sort:");
        int[] arr1 = Arrays.copyOf(arr, arr.length);
        insertion_sort(arr1);
        display(arr1);


        System.out.println("\nBubble Sort:");
        int[] arr2 = Arrays.copyOf(arr, arr.length);
        bubble_sort(arr2);
        display(arr2);

        System.out.println("\nSelection Sort:");
        int[] arr3 = Arrays.copyOf(arr, arr.length);
        selection_sort(arr3);
        display(arr3);

        System.out.println("\nMerge Sort:");
        int[] arr4 = Arrays.copyOf(arr, arr.length);
        merge_sort(arr4,0,arr4.length-1);
        display(arr4);

        System.out.println("\nQuick Sort:");
        int[] arr5 = Arrays.copyOf(arr, arr.length);
        quick_sort(arr5,0,arr5.length-1);
        display(arr5);



        System.out.println("\nHeap Sort:");
        int[] arr6 = Arrays.copyOf(arr, arr.length);
        heap_sort(arr6);
        display(arr6);
    }
}

