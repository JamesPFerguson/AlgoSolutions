function areAnagrams(words) {
    let wordOne = ""
    let wordTwo = ""
    let anagrams = false
    for (let i = 0; i < words.length -1; i++) {
        wordOne = words[i].toLowerCase().replace(/[^a-z]/g, "").split("").sort().join("");
        wordTwo = words[i+1].toLowerCase().replace(/[^a-z]/g, "").split("").sort().join("");
        if (wordOne == wordTwo) {
            anagrams = true
        }
        else {
            anagrams = false
            break
        }
    }
    return anagrams
}

// .replace(/ /g, "")
// .replace(/ /g, "")

// areAnagrams(["Elvis", "Lives"])