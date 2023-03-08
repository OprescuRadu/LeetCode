class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] nums3 = new int[nums1.length];
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for(int i = 0; i < nums1.length; i++){
            set1.add(nums1[i]);
        }
        for(int i = 0; i < nums2.length; i++){
            set2.add(nums2[i]);
        }
        set2.retainAll(set1);
        int j = 0;
        Iterator<Integer> list = set2.iterator();
        while(list.hasNext()) {
            nums3[j] = list.next();
            j++;
        }
        return Arrays.copyOf(nums3, j);
    }
}