function findAnagrams(s: string, p: string): number[] {
    const result: number[] = [];
    const freq = new Map<string, number>();

    for (const ch of p) {
        freq.set(ch, (freq.get(ch) || 0) + 1);
    }

    let counter = freq.size, begin = 0, end = 0;

    while (end < s.length) {
        if (freq.has(s[end])) {
            freq.set(s[end], freq.get(s[end])! - 1);
            if (freq.get(s[end]) === 0) {
                counter--;
            }
        }
        end++;
        while (counter === 0) {
            if (end - begin === p.length) {
                result.push(begin);
            }
            if (freq.has(s[begin])) {
                freq.set(s[begin], freq.get(s[begin])! + 1);
                if (freq.get(s[begin])! > 0) {
                    counter++;
                }
            }
            begin++;
        }
    }

    return result;
};