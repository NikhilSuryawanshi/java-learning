package math;

public class BinSearch {

    int binSearch(int[] arr,int size , int key)
    {
        int index=-1;
        int s=0,e=size-1;
        int mid=s+(e-s)/2;
        while (s<=e)
        {
            if (arr[mid]==key)
            {
                index=mid;
                return index;
            }
            else if (arr[mid]>key)
            {
                e=mid-1;
            }
            else if(arr[mid]<key)
            {
                s=mid+1;
            }

            mid=s+(e-s)/2;
        }
        return index;
    }

    int firstOcc(int[] arr,int size , int key)
    {
        int index=-1;
        int s=0,e=size-1;
        int mid=s+(e-s)/2;
        while (s<=e)
        {
            if (arr[mid]==key)
            {
                index=mid;
                e=mid-1;
            }
            else if (arr[mid]>key)
            {
                e=mid-1;
            }
            else if(arr[mid]<key)
            {
                s=mid+1;
            }

            mid=s+(e-s)/2;
        }
        return index;
    }
    int lastOcc(int[] arr,int size , int key)
    {
        int index=-1;
        int s=0,e=size-1;
        int mid=s+(e-s)/2;
        while (s<=e)
        {
            if (arr[mid]==key)
            {
                index=mid;
                s=mid+1;
            }
            else if (arr[mid]>key)
            {
                e=mid-1;
            }
            else if(arr[mid]<key)
            {
                s=mid+1;
            }

            mid=s+(e-s)/2;
        }
        return index;
    }

    public static void main(String[] args) {
        BinSearch b=new BinSearch();
        int arr[] ={1,2,3,3,3,4,4,5,7,11,11};
        int key=11;
        int index=b.lastOcc(arr, arr.length, key);
        System.out.println("Index of key "+key+" is :"+  index );
    }
}
