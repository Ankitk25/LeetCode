// class Solution {
//     public int[] sortJumbled(int[] mapping, int[] nums) {
//         ArrayList<Integer> arr= new ArrayList<>();
//         for (int i = 0; i < nums.length; i++) {
//             int temp = nums[i];
//             StringBuilder str = new StringBuilder();

//             if (temp == 0) {
//                 str.append(mapping[0]);
//             }

//             while (temp > 0) {
//                 int digit = temp % 10;
//                 str.append(mapping[digit]);
//                 temp /= 10;
//             }

//             str.reverse();
//             String s = str.toString();
//             int a = Integer.parseInt(s);
//             arr.add(a);
//         }

//         List<Integer> index = new ArrayList<>();
//         for (int i = 0; i < nums.length; i++) {
//             index.add(i);
//         }

//         index.sort((i, j) -> arr.get(i).compareTo(arr.get(j)));

//         int[] sortedNums = new int[nums.length];
//         for (int i = 0; i < nums.length; i++) {
//             sortedNums[i] = nums[index.get(i)];
//         }

//         for (int i = 0; i < nums.length; i++) {
//             nums[i] = sortedNums[i];
//         }
//         return nums;
//     }
// }
class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        List<int[]> mappedList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            String s = Integer.toString(nums[i]);
            StringBuilder n = new StringBuilder();
            for (char ch : s.toCharArray()) {
                n.append(mapping[ch - '0']);
            }
            mappedList.add(new int[]{nums[i], Integer.parseInt(n.toString()), i});
        }

        mappedList.sort((a, b) -> {
            if (a[1] != b[1]) {
                return Integer.compare(a[1], b[1]);
            } else {
                return Integer.compare(a[2], b[2]);
            }
        });

        int[] sortedNums = new int[nums.length];
        for (int i = 0; i < mappedList.size(); i++) {
            sortedNums[i] = mappedList.get(i)[0];
        }

        return sortedNums;
    }
}