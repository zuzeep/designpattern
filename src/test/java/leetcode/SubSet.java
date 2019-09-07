package leetcode;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * 给定一个set，求它的所有子集
 */
public class SubSet {

    private final static Logger log = LoggerFactory.getLogger(SubSet.class);

    /**
     * 按照一般思路，应该是用递归循环
     * leetcode中还提示有一种办法，那就是位运算，这里采用位运算实现
     */
    @Test
    public void getSubSet(){
        int[] source = new int[]{0,1,2};
        subsets(source).stream().forEach(s -> log.info(Joiner.on(",").join(s)));
    }

    private List<List<Integer>> subsets(int[] nums){
        if(nums == null || nums.length == 0){
            return Collections.emptyList();
        }else {
            List<List<Integer>> results = new ArrayList<>();
            for(int i=0; i <Math.pow(2, nums.length); i++){
                List<Integer> sub = new ArrayList<>();
                int index = i;
                for(int j=0; j<nums.length; j++){
                    if((index & 1) == 1){
                        sub.add(nums[j]);
                    }
                    index >>= 1;
                }
                results.add(sub);
            }
            return results;
        }
    }
}
