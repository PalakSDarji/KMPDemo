import SwiftUI
import shared

struct UserListView: View {
    @StateObject private var viewModel = UserListViewModel()

    var body: some View {
        NavigationView {
            List(viewModel.users, id: \.id) { user in
                NavigationLink(destination: UserDetailView(user: user)) {
                    VStack(alignment: .leading, spacing: 4) {
                        Text(user.name)
                            .font(.headline)
                        Text(user.email)
                            .font(.subheadline)
                            .foregroundColor(.secondary)
                    }
                }
            }
            .navigationTitle("Users")
        }
    }
}
