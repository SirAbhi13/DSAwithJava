class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int l = 0;
        int r = arr.length-1;
        
        while(l<=r){
            int mid = (r-l)/2 + l;
            if(mid!=0)
            {
                if (arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1])
                    return mid;

                else if (arr[mid] < arr[mid + 1] && arr[mid] > arr[mid - 1]) {
                    l = mid + 1;
                } else if (arr[mid] > arr[mid + 1] && arr[mid] < arr[mid - 1]) {
                    r = mid - 1;
                }
            }
            else{
                if(arr[mid]>arr[1])
                    return mid;
                else
                    return 1;
            }
        }
        return l;
    }
}