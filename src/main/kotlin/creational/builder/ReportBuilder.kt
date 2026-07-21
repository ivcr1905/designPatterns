// PRACTICE:
// Analytics reports can mix filters, sections, date ranges, and optional footers.
// Enforce rules like requiring a title and at least one section before build time.
// Add new output variations later without changing report assembly code.
package creational.builder

data class Section(
    val heading: String,
    val rows: List<String>
)

data class Report(
    val title: String,
    val dateRange: String,
    val filters: Map<String, String>,
    val sections: List<Section>,
    val footer: String?
)

class ReportBuilder {
    private var title: String? = null
    private var dateRange: String = ""
    private val filters = mutableMapOf<String, String>()
    private val sections = mutableListOf<Section>()
    private var footer: String? = null

    fun title(value: String): ReportBuilder {
        TODO("Store the report title and return the builder")
    }

    fun dateRange(value: String): ReportBuilder {
        TODO("Store the report date range and return the builder")
    }

    fun addFilter(key: String, value: String): ReportBuilder {
        TODO("Add a filter to the report and return the builder")
    }

    fun addSection(heading: String, rows: List<String>): ReportBuilder {
        TODO("Add a section to the report and return the builder")
    }

    fun footer(value: String): ReportBuilder {
        TODO("Store the footer text and return the builder")
    }

    fun build(): Report {
        TODO("Validate title and sections, then create the Report")
    }
}

fun main() {
    // 1. Build a report with title, date range, filters, and sections
    // 2. Try including an optional footer
    // 3. Verify build() enforces the required title and section rules
    TODO()
}
