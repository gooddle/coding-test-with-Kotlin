class Solution {
   fun solution(newId: String): String {
    var newId = newId.lowercase()

    newId = newId.replace(Regex("[^a-z0-9._-]"), "")

    newId = newId.replace(Regex("\\.{2,}"), ".")

    newId = newId.trim('.')

    if (newId.isEmpty()) {
        newId = "a"
    }


    if (newId.length >= 16) {
        newId = newId.substring(0, 15).trimEnd('.')
    }

    while (newId.length < 3) {
        newId += newId.last()
    }

    return newId
}
}