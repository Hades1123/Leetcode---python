// Two pointer
// Time : O(n) ; Space : O(1) 

function trap(height: number[]): number {
    let n = height.length, result = 0;
    let l = 0, r = n - 1;
    let lMax = height[0], rMax = height[n - 1];
    while (l < r) {
        if (height[l] <= height[r]) {
            result += Math.max(0, lMax - height[l]);
            lMax = Math.max(lMax, height[l]);
            l++;
        } else {
            result += Math.max(0, rMax - height[r]);
            rMax = Math.max(rMax, height[r]);
            r--;
        }
    }
    return result;
};