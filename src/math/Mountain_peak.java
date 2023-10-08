package math;

public class Mountain_peak {
    int mountainPeak(int[] arr)
    {
        int start =0,end =arr.length-1;
        int mid=start+(end-start)/2;
        while( start < end ){

            if (arr[mid]<arr[mid+1])
            {
                start=mid+1;

            }else{
                end=mid;
            }
            mid=start+(end-start)/2;
        }
        return start;
    }

    public static void main(String[] args) {
        int arr[]={10,11,12,13,1,2,3,4,5,6};
        Mountain_peak p=new Mountain_peak();
        int index=p.mountainPeak(arr);
        System.out.println(index);
    }
}
