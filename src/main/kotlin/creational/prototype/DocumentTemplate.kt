// PRACTICE:
// A CMS offers reusable templates that editors clone before filling in client details.
// Deep-copy metadata, sections, and required fields so edits never leak across copies.
// Reuse the same cloning idea for future template families like contracts or blog posts.
package creational.prototype

data class Section(
    var title: String,
    var placeholderContent: String
)

data class DocumentTemplate(
    var templateName: String,
    var metadata: MutableMap<String, String>,
    var sections: MutableList<Section>,
    var requiredFields: MutableList<String>
) {
    fun clone(): DocumentTemplate {
        TODO("Deep-copy metadata, sections, and required fields")
    }
}

fun main() {
    // 1. Create a base document template
    // 2. Clone it for different clients or documents
    // 3. Prove nested data changes do not affect the original template
    TODO()
}
