import DotaInfoShared
import SwiftUI

struct ContentView: View {
    let greeting = "Hello, \(Meta.shared.platform)!"

    var body: some View {
        Text(greeting)
            .padding()
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
