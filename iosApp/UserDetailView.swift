import SwiftUI
import shared

struct UserDetailView: View {
    let user: User

    var body: some View {
        ScrollView {
            VStack(alignment: .leading, spacing: 12) {
                Text(user.name)
                    .font(.title2)
                    .bold()

                detailRow(title: "Email", value: user.email)
                detailRow(title: "Location", value: user.location)
                detailRow(title: "About", value: user.bio)
            }
            .frame(maxWidth: .infinity, alignment: .leading)
            .padding(16)
        }
        .navigationTitle("Details")
    }

    @ViewBuilder
    private func detailRow(title: String, value: String) -> some View {
        VStack(alignment: .leading, spacing: 4) {
            Text(title)
                .font(.caption)
                .foregroundColor(.secondary)
            Text(value)
                .font(.body)
        }
    }
}
