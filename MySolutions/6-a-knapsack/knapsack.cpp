#include <iostream>
#include <vector>
#include<bits/stdc++.h>
using namespace std

int main() {
    int n, W;
    cin >> n >> W;
    vector<int> w(n), v(n);
    for (int i = 0; i < n; ++i)
        cin >> w[i] >> v[i];

    vector<int> result;
    // your code

    cout << result.size() << endl;
    for (int i = 0; i < result.size(); ++i) {
        if (i != 0) cout << ' ';
        cout << result[i];
    }
    cout << endl;

    return 0;
}