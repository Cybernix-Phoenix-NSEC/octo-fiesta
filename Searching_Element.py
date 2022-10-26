class Solution:  
    def search(self, list1: List[int], target: int) -> int:  
        l, r = 0, len(list1) - 1  
          
        while l<=r:  
            mid = (l + r) // 2  
            if target == list1[mid]:  
                return mid    
            if list1[l] <= list1[mid]:  
                if target > list1[mid] or target < list1[l]:  
                    l = mid + 1  
                else:   
                    r = mid - 1  
            else:  
                  
                if target < list1[mid] or target > list1[r]:  
                    r = mid - 1  
                else:  
                    l = mid + 1  
                
        return -1  
list1 = eval(input("Enter the elements of list within '[]' :")) 
target = int(input("Enter element to search for :")) 
obj = Solution()  
print("The element is at the", obj.search(list1, target), "index")  
