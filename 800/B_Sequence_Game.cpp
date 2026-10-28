#include <bits/stdc++.h>
using namespace std;

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t;
    cin >> t;

    int n;
    while (t-- > 0)
    {
        cin >> n;
        vector<int> arr(n, 0);
        cin >> arr[0];
        int idx = 1;
        for (int i = 1; i < n; i++)
        {
            cin >> arr[i];
            if (arr[i] < arr[i - 1])
            {
                idx++;
            }
            idx++;
        }

        cout << idx << '\n';
        for (int i = 0; i < n; i++)
        {
            cout << arr[i] << " ";
            if(i > 0 && arr[i] < arr[i - 1]) {
                cout << arr[i] << " ";
            }
        }
        cout << '\n';
    }
    return 0;
}