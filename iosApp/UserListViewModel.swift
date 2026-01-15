import Foundation
import shared

final class UserListViewModel: ObservableObject {
    private let repository = UserRepository()

    @Published var users: [User] = []

    init() {
        loadUsers()
    }

    func loadUsers() {
        let kotlinUsers = repository.getUsersArray()
        var mapped: [User] = []
        let count = Int(kotlinUsers.size)
        if count > 0 {
            mapped.reserveCapacity(count)
        }
        for index in 0..<count {
            if let user = kotlinUsers.get(index: Int32(index)) as? User {
                mapped.append(user)
            }
        }
        users = mapped
    }
}
