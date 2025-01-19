package PatternsCJ

import std.collection.{
  List, ArrayList
}

// https://leetcode.cn/problems/subsets
func subsets(nums: Array<Int64>): ArrayList<ArrayList<Int64>> {
    var result = ArrayList<ArrayList<Int64>>()

    func backtrack(start!: Int64, track!: ArrayList<Int64>): Unit {
        result.add(ArrayList(track))
        for (i in start..nums.size) {
            track.add(nums[i])
            backtrack(start: i + 1, track: track)
            track.remove(at: track.size - 1)
        }
    }

    backtrack(start: 0, track: ArrayList<Int64>())
    return result
}
