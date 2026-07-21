// PRACTICE:
// A screen should render with either a light or dark visual theme.
// Create matching buttons and text fields without exposing concrete classes.
// Add more themes later while keeping screen-building code unchanged.
package creational.abstractfactory

interface UIComponentFactory {
    fun createButton(): Button
    fun createTextField(): TextField
}

interface Button {
    fun render()
}

interface TextField {
    fun render()
}

class LightThemeFactory : UIComponentFactory {
    override fun createButton(): Button {
        TODO("Create the light-theme button implementation")
    }

    override fun createTextField(): TextField {
        TODO("Create the light-theme text field implementation")
    }
}

class DarkThemeFactory : UIComponentFactory {
    override fun createButton(): Button {
        TODO("Create the dark-theme button implementation")
    }

    override fun createTextField(): TextField {
        TODO("Create the dark-theme text field implementation")
    }
}

class LightButton : Button {
    override fun render() {
        TODO("Render a light-themed button")
    }
}

class LightTextField : TextField {
    override fun render() {
        TODO("Render a light-themed text field")
    }
}

class DarkButton : Button {
    override fun render() {
        TODO("Render a dark-themed button")
    }
}

class DarkTextField : TextField {
    override fun render() {
        TODO("Render a dark-themed text field")
    }
}

fun main() {
    // 1. Select a light or dark factory
    // 2. Create a button and text field from the same family
    // 3. Render both components and compare the paired theme
    TODO()
}
