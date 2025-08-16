// time: O(n) space: O(n)
function countBits(n: number): number[] {
    if (n === 0) {
        return [0];
    }
    const result: number[] = [];
    result.push(0, 1);
    let index = 1;
    let size = Math.floor((n + 1) / 2);
    for (let i = 1; i < size; ++i) {
        result.push(result[index]);
        result.push(result[index] + 1);
        index += 1;
    }
    if ((n + 1) % 2 !== 0) {
        result.push(result[index]);
    }
    return result;
};