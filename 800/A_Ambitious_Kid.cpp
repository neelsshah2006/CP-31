#include <bits/stdc++.h>
using namespace std;

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int n;
    cin >> n;
    int mn = INT_MAX, tmp;
    for (int i = 0; i < n; i++)
    {
        cin >> tmp;
        mn = min(mn, abs(tmp));
    }
    cout << mn << '\n';
    return 0;
}