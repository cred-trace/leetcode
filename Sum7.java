class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {

            int pointer1 = 0;
            int pointer2 = 0;
            int[] result_array = new int[m + n];

            while (pointer1 < m && pointer2 < n) {
                if (nums1[pointer1] == nums2[pointer2]) {
                    result_array[pointer1 + pointer2] = nums1[pointer1];
                    pointer1++;
                    result_array[pointer1 + pointer2] = nums2[pointer2];
                    pointer2++;
                }

                if (pointer1 < m && pointer2 < n && nums1[pointer1] < nums2[pointer2]) {
                    result_array[pointer1 + pointer2] = nums1[pointer1];
                    pointer1++;
                } else if (pointer1 < m && pointer2 < n && nums2[pointer2] < nums1[pointer1]) {
                    result_array[pointer1 + pointer2] = nums2[pointer2];
                    pointer1++;
                }
            }

            if (pointer1 < m) {
                for (int i = pointer1; i < m; i++) {
                    result_array[pointer2 + i] = nums1[i];
                }
            } else if (pointer2 < n) {
                for (int i = pointer2; i < n; i++) {
                    result_array[pointer1 + i] = nums2[i];
                }
            }

            System.out.println(Arrays.toString(result_array));
        }
}
//  merege two sorted array