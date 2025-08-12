function reverseWords(s: string): string {
    return s
        .trim()
        .split(' ')
        .filter(item => item && item != ' ')
        .map((item, index, arr) => arr[arr.length - 1 - index])
        .join(' ');
};