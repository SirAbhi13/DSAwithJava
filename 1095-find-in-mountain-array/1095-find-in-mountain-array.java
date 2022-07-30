/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray arr) {
        int peak_index = findPeak(arr);
        
        
        // System.out.println(peak_index);
        int min_index = bS(arr, 0, peak_index, target);
        if(min_index !=-1){
            return min_index;
        }
        return bS(arr, peak_index + 1, arr.length()-1 ,target);
        
        
    }
    
    public int findPeak(MountainArray arr){
        int l = 0;
        int r = arr.length()-1;
        
        while(l<r){
            int mid = (r-l)/2 + l;
            if(arr.get(mid)>arr.get(mid+1)){
                r = mid;
            }
            else{
                l = mid+1;
            }
            
            
        }
        return l;
    }
    
    public int bS(MountainArray arr, int l, int r, int target){
        
        boolean isA = arr.get(l)<arr.get(r);
        while(l<=r){
            int mid = (r-l)/2 + l;
            if (arr.get(mid) == target)
                return mid;
            if (isA)
               { if(arr.get(mid) > target){
                    r = mid -1;
                }
                else if(arr.get(mid)<target){
                    l = mid + 1;
                }
               }
            else{ 
                if(arr.get(mid) < target){
                    r = mid -1;
                }
                else if(arr.get(mid)>target){
                    l = mid + 1;
                }
               }
            
        }
        return -1;
    }
    
}