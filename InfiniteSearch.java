

    public class InfiniteSearch
    {
        public int searchInfinitly(int[] arr, int key){
            int low=0;
            int hight=1;
            while (arr[hight]<key){
                low=hight;
                hight=2*hight;
            }
            return binarySearch(arr,key,low,hight);
        }
        int binarySearch(int arr[], int l, int r, int x)
        {
            if (r>=l)
            {
                int mid = l + (r - l)/2;
                if (arr[mid] == x)
                    return mid;
                if (arr[mid] > x)
                    return binarySearch(arr, l, mid-1, x);
                return binarySearch(arr, mid+1, r, x);
            }
            return -1;
        }

        public static void main(String args[])
        {
            InfiniteSearch ob = new InfiniteSearch();
            int arr[] = {2,3,4,10,40,50,60,70,80,90,100,111,222,333,444,555,666,777,888,999,1111,2222,3333,4444,5555,6666};
            int key = 111;
            int result = ob.searchInfinitly(arr,key);
            if (result == -1)
                System.out.println("Element not present");
            else
                System.out.println("Element found at index " + result);
        }
    }




