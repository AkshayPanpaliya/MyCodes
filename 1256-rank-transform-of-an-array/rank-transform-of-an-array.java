class Solution {
    public int[] arrayRankTransform(int[] arr) {
    int [] rank=arr.clone();
    Arrays.sort(rank);
    Map<Integer,Integer> map=new HashMap<>();
    int rankk=1;
    for(int i=0;i<rank.length;i++)
    {
    if(!map.containsKey(rank[i]))
    {
        map.put(rank[i],rankk++);
    }
    }
     
    int [] result=new int[arr.length];
    for(int i=0;i<arr.length;i++)
      {
        result[i]=map.get(arr[i]);

      }
      return result;
    }
}

// int[] sorted = arr.clone();
//         Arrays.sort(sorted);

//         Map<Integer, Integer> map = new HashMap<>();
//         int rank = 1;

//         for (int num : sorted) {
//             if (!map.containsKey(num)) {
//                 map.put(num, rank++);
//             }
//         }

//         int[] result = new int[arr.length];
//         for (int i = 0; i < arr.length; i++) {
//             result[i] = map.get(arr[i]);
//         }

//         return result;
//     }
// }