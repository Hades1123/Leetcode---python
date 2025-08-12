function findMaxAverage(nums: number[], k: number): number {

    let result = 0, temp = 0, window = 0;

    for (let i = 0; i < k; ++i) {
        temp += nums[i];
    }

    result = temp / k;

    for (let i = k; i < nums.length; ++i) {
        temp = temp - nums[window++] + nums[i];
        result = Math.max(temp / k, result);
    }

    return result;
};