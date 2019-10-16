#include<bits/stdc++.h>
using namespace std
int main() {
    int n;
    cin >> n;
    vector<int> x(n), y(n);
    for (int i = 0; i < n; ++i)
        cin >> x[i] >> y[i];

    vector<int> f(n), s(n);

    for (int i = 0; i < n; ++i) {
        cout << f[i] << ' ' << s[i] << endl;
    }

    return 0;
}