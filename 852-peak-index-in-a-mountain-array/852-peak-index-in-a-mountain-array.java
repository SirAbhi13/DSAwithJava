class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int l = 0;
        int r = arr.length-1;
        
        while(l<r){
            int mid = (r-l)/2 + l;
            //Making sure we don't get out of bound error
            if(mid!=0)
            {   //if the value is the peak (checking left and right)
                if (arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1])
                    return mid;
                //if the value of mid is in increasing part of the array
                else if (arr[mid] < arr[mid + 1] && arr[mid] > arr[mid - 1]) {
                    l = mid + 1;
                } 
                // if the value of mid in decreasing part of the array
                else if (arr[mid] > arr[mid + 1] && arr[mid] < arr[mid - 1]) {
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